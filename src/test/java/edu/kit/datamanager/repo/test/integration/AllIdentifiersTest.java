/*
 * Copyright 2018 Karlsruhe Institute of Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.kit.datamanager.repo.test.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.kit.datamanager.repo.configuration.ApplicationProperties;
import edu.kit.datamanager.repo.dao.IAllIdentifiersDao;
import edu.kit.datamanager.repo.domain.AllIdentifiers;
import edu.kit.datamanager.repo.domain.DataResource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithSecurityContextTestExecutionListener;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.ServletTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author jejkal
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestExecutionListeners(listeners = {ServletTestExecutionListener.class,
  DependencyInjectionTestExecutionListener.class,
  DirtiesContextTestExecutionListener.class,
  TransactionalTestExecutionListener.class,
  WithSecurityContextTestExecutionListener.class})
@ActiveProfiles("test")
public class AllIdentifiersTest{

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private IAllIdentifiersDao identifiersDao;

  @Autowired
  private ApplicationProperties applicationProperties;


  @Before
  public void setUp() throws JsonProcessingException{
    AllIdentifiers id = createIdentifiers("first", "resource", DataResource.State.GONE);
    identifiersDao.save(id);
 id = createIdentifiers("second", "resource", DataResource.State.GONE);
    identifiersDao.save(id);
 id = createIdentifiers("third", "resource", DataResource.State.GONE);
    identifiersDao.save(id);
 id = createIdentifiers("4", "resource", DataResource.State.GONE);
    identifiersDao.save(id);
 id = createIdentifiers("5", "resource", DataResource.State.GONE);
    identifiersDao.save(id);
 id = createIdentifiers("6", "resource", null);
    identifiersDao.save(id);
  }
  
  public AllIdentifiers createIdentifiers(String Identifier, String resource, DataResource.State state) {
    AllIdentifiers result = new AllIdentifiers();
    result.setIdentifier(Identifier);
    result.setResourceId(resource);
    result.setStatus(state);
    return result;
  }

  /**
   * FIND TESTS*
   */
  @Test
  public void testAll() throws Exception{
    Assert.assertTrue(false);
  }
  @Test
  public void testDoubleEntry() throws Exception{
    createIdentifiers("6", "anyResource", DataResource.State.FIXED);
    Assert.assertTrue(false);
  }
}

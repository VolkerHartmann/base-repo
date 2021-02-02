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
package edu.kit.datamanager.repo.util;

import edu.kit.datamanager.entities.Identifier;
import edu.kit.datamanager.entities.PERMISSION;
import edu.kit.datamanager.entities.RepoServiceRole;
import edu.kit.datamanager.entities.RepoUserRole;
import edu.kit.datamanager.exceptions.AccessForbiddenException;
import edu.kit.datamanager.exceptions.ResourceNotFoundException;
import edu.kit.datamanager.repo.domain.ContentInformation;
import edu.kit.datamanager.repo.domain.DataResource;
import edu.kit.datamanager.repo.domain.acl.AclEntry;
import edu.kit.datamanager.util.AuthenticationHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jejkal
 */
public class ContentDataUtils{

  private static final Logger LOGGER = LoggerFactory.getLogger(ContentDataUtils.class);

  private ContentDataUtils(){
  }
  /** 
   * Create a new data resource.
   * @return 
   */
  public static ContentInformation addFile(DataResource resource, MultipartFile file, String path, boolean force, boolean finalizeVersion) {
    ContentInformation newDataResource;
    return newDataResource;
  }
  /**
   * Read an existing resource.
   * @param alternateId 
   * @return 
   */
  public static ContentInformation readFile(String alternateId, String path, OutputStream fileStream) {
    ContentInformation newDataResource;
    return newDataResource;
  }
  /**
   * Delete an existing resource.
   * @param newResource
   * @return 
   */
  public static ContentInformation deleteFile(DataResource resource, String path, boolean force, boolean finalizeVersion) {
    ContentInformation newDataResource;
    return newDataResource;
  }

}

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
package edu.kit.datamanager.repo.configuration;

import edu.kit.datamanager.repo.service.impl.NoneDataVersioningService;
import java.net.URL;

/**
 * Holds all properties needed to manage data resources.
 */
public class RepoBaseConfiguration {

  /**
   * Base path of repo. (External url is also allowed.)
   */
  private URL basepath;
  /**
   * Which version method to use.
   */
  private String versioning;
  /**
   * Which path pattern should be used.
   */
  //private FileHierarchy hierarchy;
  private String pathPattern;
  /**
   * Repo is read only or not.
   */
  private boolean readOnly;
  /**
   * Versioning is supported or not.
   */
  private boolean auditEnabled;

  /**
   * If versioning is available or not.
   *
   * @return true or false.
   */
  public boolean isAuditEnabled() {
    return auditEnabled;
  }

  /**
   * @return the basePath
   */
  public URL getBasepath() {
    return basepath;
  }

  /**
   * @param basePath the basePath to set
   */
  public void setBasepath(URL basePath) {
    this.basepath = basePath;
  }

  /**
   * @return the versioning
   */
  public String getVersioning() {
    return versioning;
  }

  /**
   * @param versioning the versioning to set
   */
  public void setVersioning(String versioning) {
    this.versioning = versioning;
    auditEnabled = new NoneDataVersioningService().getServiceName().equals(versioning);
  }

//  /**
//   * @return the hierarchy
//   */
//  public FileHierarchy getHierarchy() {
//    return hierarchy;
//  }
//
//  /**
//   * @param hierarchy the hierarchy to set
//   */
//  public void setHierarchy(FileHierarchy hierarchy) {
//    this.hierarchy = hierarchy;
//  }
  /**
   * @return the readOnly
   */
  public boolean isReadOnly() {
    return readOnly;
  }

  /**
   * @param readOnly the readOnly to set
   */
  public void setReadOnly(boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * @return the pathPattern
   */
  public String getPathPattern() {
    return pathPattern;
  }

  /**
   * @param pathPattern the pathPattern to set
   */
  public void setPathPattern(String pathPattern) {
    this.pathPattern = pathPattern;
  }

}

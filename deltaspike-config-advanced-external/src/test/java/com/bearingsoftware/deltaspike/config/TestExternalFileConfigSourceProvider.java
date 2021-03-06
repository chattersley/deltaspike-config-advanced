/**
 * Copyright 2018 Craig Hattersley
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.bearingsoftware.deltaspike.config;

import javax.enterprise.context.ApplicationScoped;

import com.bearingsoftware.deltaspike.config.ExternalFileConfigSourceProvider;

/**
 * Test class extending {@link ExternalFileConfigSourceProvider}.
 */
@ApplicationScoped
public class TestExternalFileConfigSourceProvider extends ExternalFileConfigSourceProvider {

  /** Prefix. */
  private static final String PREFIX = "test";

  /** Property file name. */
  private static final String PROPERTY_FILE = "test.properties";

  /** Configuration folder key. */
  private static final String CONFIGURATION_FOLDER_KEY = "test.properties.folder";

  /**
   * {@inheritDoc}.
   */
  @Override
  public String getPrefix() {
    return PREFIX;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public String getConfigurationFolderKey() {
    return CONFIGURATION_FOLDER_KEY;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public String getPropertyFile() {
    return PROPERTY_FILE;
  }
}

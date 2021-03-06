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

import org.yaml.snakeyaml.Invoice;

/**
 * Test class extending {@link YmlFileConfigSourceProvider}.
 */
@ApplicationScoped
public class TestYmlFileConfigSourceProvider extends YmlFileConfigSourceProvider {

  /** Property file name. */
  private static final String PROPERTY_FILE = "test.yaml";

  /** Configuration folder key. */
  private static final String CONFIGURATION_FOLDER_KEY = "yaml.properties.folder";

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

  /**
   * {@inheritDoc}.
   */
  @Override
  public Class<?> getConfiguration() {
    return Invoice.class;
  }
}

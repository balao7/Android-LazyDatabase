/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright 2015 Redwarp
 */

package net.redwarp.library.testapplication;

import net.redwarp.library.database.annotation.PrimaryKey;

/**
 * Created by Redwarp on 27/05/2015.
 */
public class RandomUser {

  @PrimaryKey
  private long mId;
  public String name;

  /**
   * Required empty constructor
   */
  public RandomUser() {
  }

  public RandomUser(String name) {
    this.name = name;
  }

  public long getId() {
    return mId;
  }
}

/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2023 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.randomccnumber;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Generate random credit card number.
 *
 * @author Samatar
 * @since 01-4-2010
 */
public class RandomCCNumberGeneratorData extends BaseStepData implements StepDataInterface {

  public int[] cardTypes;
  public int[] cardSize;
  public int[] cardLen;
  public RowMetaInterface outputRowMeta;

  public boolean addCardTypeOutput;
  public boolean addCardLengthOutput;

  public RandomCCNumberGeneratorData() {
    super();
    addCardTypeOutput = false;
    addCardLengthOutput = false;
  }
}

/*
 * Copyright 2010 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package azkaban.jobs;

import azkaban.app.JobDescriptor;

import com.google.common.collect.ImmutableSet;


public class RubyJob extends LongArgJob {

    private static final String RUBY_BINARY_KEY = "ruby";
    private static final String SCRIPT_KEY = "script";

    public RubyJob(JobDescriptor desc) {
        super(new String[]{desc.getProps().getString(RUBY_BINARY_KEY, "ruby"), 
                           desc.getProps().getString(SCRIPT_KEY)}, 
              desc, 
              ImmutableSet.of(RUBY_BINARY_KEY, SCRIPT_KEY, JobDescriptor.JOB_TYPE));
    }

   
    
}

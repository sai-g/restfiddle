/*
 * Copyright 2015 Ranjan Kumar
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
package com.restfiddle.dto;

import java.util.List;

public class AssertionDTO {
    
    private int statusCode;

    private int responseTime;

    private int responseSize;

    private String bodyContentType;

    private List<BodyAssertDTO> bodyAssertDTOs;

    public List<BodyAssertDTO> getBodyAssertDTOs() {
	return bodyAssertDTOs;
    }

    public void setBodyAssertDTOs(List<BodyAssertDTO> bodyAssertDTOs) {
	this.bodyAssertDTOs = bodyAssertDTOs;
    }

    public int getStatusCode() {
	return statusCode;
    }

    public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
    }

    public int getResponseTime() {
	return responseTime;
    }

    public void setResponseTime(int responseTime) {
	this.responseTime = responseTime;
    }

    public int getResponseSize() {
	return responseSize;
    }

    public void setResponseSize(int responseSize) {
	this.responseSize = responseSize;
    }

    public String getBodyContentType() {
	return bodyContentType;
    }

    public void setBodyContentType(String bodyContentType) {
	this.bodyContentType = bodyContentType;
    }
}

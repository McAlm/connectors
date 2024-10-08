/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. Licensed under a proprietary license.
 * See the License.txt file for more information. You may not use this file
 * except in compliance with the proprietary license.
 */
package io.camunda.connector.email.response;

import java.util.List;

public record ReadEmailResponse(
    String messageId,
    List<String> fromAddresses,
    String subject,
    Integer size,
    String plainTextBody,
    String htmlBody) {}

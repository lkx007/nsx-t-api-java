/*
 * NSX-T Manager API
 * VMware NSX-T Manager REST API
 *
 * OpenAPI spec version: 2.5.1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.BaseFirewallProfile;
import io.swagger.client.model.ExcludeList;
import io.swagger.client.model.FirewallProfileListResult;
import io.swagger.client.model.FirewallRule;
import io.swagger.client.model.FirewallRuleList;
import io.swagger.client.model.FirewallRuleListResult;
import io.swagger.client.model.FirewallSection;
import io.swagger.client.model.FirewallSectionListResult;
import io.swagger.client.model.FirewallSectionLock;
import io.swagger.client.model.FirewallSectionRuleList;
import io.swagger.client.model.FirewallSectionState;
import io.swagger.client.model.FirewallSectionsSummaryList;
import io.swagger.client.model.FirewallStats;
import io.swagger.client.model.FirewallStatsList;
import io.swagger.client.model.FirewallStatus;
import io.swagger.client.model.FirewallStatusListResult;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.RuleState;
import io.swagger.client.model.TargetResourceStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiServicesFirewallApi
 */
@Ignore
public class ManagementPlaneApiServicesFirewallApiTest {

    private final ManagementPlaneApiServicesFirewallApi api = new ManagementPlaneApiServicesFirewallApi();

    /**
     * Add a new object in the exclude list
     *
     * Add a new object in the exclude list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMemberAddMemberTest() throws ApiException {
        ResourceReference body = null;
        ResourceReference response = api.addMemberAddMember(body);

        // TODO: test validations
    }
    /**
     * Add a Single Rule in a Section
     *
     * Adds a new firewall rule in existing firewall section. Adding firewall rule to a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale content to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRuleInSectionTest() throws ApiException {
        FirewallRule body = null;
        String sectionId = null;
        String id = null;
        String operation = null;
        FirewallRule response = api.addRuleInSection(body, sectionId, id, operation);

        // TODO: test validations
    }
    /**
     * Add Multiple Rules in a Section
     *
     * Create multiple firewall rules in existing firewall section bounded by limit of 1000 firewall rules per section. Adding multiple firewall rules in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRulesInSectionCreateMultipleTest() throws ApiException {
        FirewallRuleList body = null;
        String sectionId = null;
        String id = null;
        String operation = null;
        FirewallRuleList response = api.addRulesInSectionCreateMultiple(body, sectionId, id, operation);

        // TODO: test validations
    }
    /**
     * Create a New Empty Section
     *
     * Creates new empty firewall section in the system. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSectionTest() throws ApiException {
        FirewallSection body = null;
        String id = null;
        String operation = null;
        FirewallSection response = api.addSection(body, id, operation);

        // TODO: test validations
    }
    /**
     * Create a Section with Rules
     *
     * Creates a new firewall section with rules. The limit on the number of rules is defined by maxItems in collection types for FirewallRule (FirewallRuleXXXList types). When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number of rule references is not supported.  Instead, to create sections, use: POST /api/v1/firewall/sections  To create rules, use: POST /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSectionWithRulesCreateWithRulesTest() throws ApiException {
        FirewallSectionRuleList body = null;
        String id = null;
        String operation = null;
        FirewallSectionRuleList response = api.addSectionWithRulesCreateWithRules(body, id, operation);

        // TODO: test validations
    }
    /**
     * Check if the object a member of the exclude list
     *
     * Check if the object a member of the exclude list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkMemberIfExistsCheckIfExistsTest() throws ApiException {
        String objectId = null;
        Boolean deepCheck = null;
        String objectType = null;
        ResourceReference response = api.checkMemberIfExistsCheckIfExists(objectId, deepCheck, objectType);

        // TODO: test validations
    }
    /**
     * Create a firewall profile.
     *
     * Create a firewall profile with values provided. It creates profile based resource_type in the payload. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFirewallProfileTest() throws ApiException {
        BaseFirewallProfile body = null;
        BaseFirewallProfile response = api.createFirewallProfile(body);

        // TODO: test validations
    }
    /**
     * Delete a firewall profile.
     *
     * Deletes a firewall profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFirewallProfileTest() throws ApiException {
        String profileId = null;
        api.deleteFirewallProfile(profileId);

        // TODO: test validations
    }
    /**
     * Delete an Existing Rule
     *
     * Delete existing firewall rule in a firewall section. Deleting firewall rule in a section modifies parent section and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRuleTest() throws ApiException {
        String sectionId = null;
        String ruleId = null;
        api.deleteRule(sectionId, ruleId);

        // TODO: test validations
    }
    /**
     * Delete an Existing Section and Its Associated Rules
     *
     * Removes firewall section from the system. Firewall section with rules can only be deleted by passing \&quot;cascade&#x3D;true\&quot; parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSectionTest() throws ApiException {
        String sectionId = null;
        Boolean cascade = null;
        api.deleteSection(sectionId, cascade);

        // TODO: test validations
    }
    /**
     * Disable firewall on target resource in dfw context
     *
     * Disable firewall on target resource in dfw context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableFirewallOnTargetResourceDisableFirewallTest() throws ApiException {
        String contextType = null;
        String id = null;
        TargetResourceStatus response = api.disableFirewallOnTargetResourceDisableFirewall(contextType, id);

        // TODO: test validations
    }
    /**
     * Enable firewall on target resource in dfw context
     *
     * Enable firewall on target resource in dfw context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableFirewallOnTargetResourceEnableFirewallTest() throws ApiException {
        String contextType = null;
        String id = null;
        TargetResourceStatus response = api.enableFirewallOnTargetResourceEnableFirewall(contextType, id);

        // TODO: test validations
    }
    /**
     * Get list of entities in exclude list
     *
     * Get list of entities in exclude list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExcludeListTest() throws ApiException {
        ExcludeList response = api.getExcludeList();

        // TODO: test validations
    }
    /**
     * Get all firewall session timer profiles.
     *
     * Return firewall session timer profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallProfileTest() throws ApiException {
        String profileId = null;
        BaseFirewallProfile response = api.getFirewallProfile(profileId);

        // TODO: test validations
    }
    /**
     * Get Firewall section level statistics section
     *
     * Get aggregated statistics for all rules for a given firewall section. The API only supports access to cached (source&#x3D;cached) statistical data collected offline in the system. Data includes total number of packets, bytes, sessions counters and popularity index for a firewall rule and overall session count, max session count and max popularity index for all firewall rules on transport nodes or edge nodes. Aggregated statistics like maximum popularity index, maximum session count and total session count are computed with lower frequency compared to individual generic rule statistics, hence they may have a computation delay up to 15 minutes to reflect in response to this API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallSectionStatsTest() throws ApiException {
        String sectionId = null;
        String source = null;
        FirewallStatsList response = api.getFirewallSectionStats(sectionId, source);

        // TODO: test validations
    }
    /**
     * Get Firewall rule level statistics
     *
     * Get aggregated statistics for a rule for given firewall section. The API only supports access to cached (source&#x3D;cached) statistical data collected offline in the system. Data includes total number of packets, bytes, sessions counters and popularity index for a firewall rule and overall session count, max session count and max popularity index for all firewall rules on transport nodes or edge nodes. Aggregated statistics like maximum popularity index, maximum session count and total session count are computed with lower frequency compared to individual generic rule statistics, hence they may have a computation delay up to 15 minutes to reflect in response to this API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallStatsTest() throws ApiException {
        String sectionId = null;
        String ruleId = null;
        String source = null;
        FirewallStats response = api.getFirewallStats(sectionId, ruleId, source);

        // TODO: test validations
    }
    /**
     * Get firewall global status for dfw context
     *
     * Get firewall global status for dfw context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallStatusTest() throws ApiException {
        String contextType = null;
        FirewallStatus response = api.getFirewallStatus(contextType);

        // TODO: test validations
    }
    /**
     * Get firewall status for target resource in dfw context
     *
     * Get firewall status for target resource in dfw context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFirewallStatusOnTargetResourceTest() throws ApiException {
        String contextType = null;
        String id = null;
        TargetResourceStatus response = api.getFirewallStatusOnTargetResource(contextType, id);

        // TODO: test validations
    }
    /**
     * Read an Existing Rule
     *
     * Return existing firewall rule information in a firewall section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleTest() throws ApiException {
        String sectionId = null;
        String ruleId = null;
        FirewallRule response = api.getRule(sectionId, ruleId);

        // TODO: test validations
    }
    /**
     * Get the Realized State of a Firewall Rule
     *
     * Return realized state information of a firewall rule. Returned response is same as rule&#x27;s section realization state response. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleStateTest() throws ApiException {
        String ruleId = null;
        Long barrierId = null;
        String requestId = null;
        RuleState response = api.getRuleState(ruleId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get All the Rules for a Section
     *
     * Return all firewall rule(s) information for a given firewall section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRulesTest() throws ApiException {
        String sectionId = null;
        String appliedTos = null;
        String contextProfiles = null;
        String cursor = null;
        Boolean deepSearch = null;
        String destinations = null;
        String extendedSources = null;
        String filterType = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean searchInvalidReferences = null;
        String services = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String sources = null;
        FirewallRuleListResult response = api.getRules(sectionId, appliedTos, contextProfiles, cursor, deepSearch, destinations, extendedSources, filterType, includedFields, pageSize, searchInvalidReferences, services, sortAscending, sortBy, sources);

        // TODO: test validations
    }
    /**
     * Get an Existing Section
     *
     * Returns information about firewall section for the identifier. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionTest() throws ApiException {
        String sectionId = null;
        FirewallSection response = api.getSection(sectionId);

        // TODO: test validations
    }
    /**
     * Get the Realized State of a Firewall Section
     *
     * Return realized state information of a firewall section. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionStateTest() throws ApiException {
        String sectionId = null;
        Long barrierId = null;
        String requestId = null;
        FirewallSectionState response = api.getSectionState(sectionId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get an Existing Section, Including Rules
     *
     * Returns firewall section information with rules for a section identifier. When invoked on a section with a large number of rules, this API is supported only at low rates of invocation (not more than 4-5 times per minute). The typical latency of this API with about 1024 rules is about 4-5 seconds. This API should not be invoked with large payloads at automation speeds. More than 50 rules with a large number rule references is not supported.  Instead, to read firewall rules, use: GET /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules with the appropriate page_size. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionWithRulesListWithRulesTest() throws ApiException {
        String sectionId = null;
        FirewallSectionRuleList response = api.getSectionWithRulesListWithRules(sectionId);

        // TODO: test validations
    }
    /**
     * Get the summary of sections in the firewall configuration.
     *
     * List the summary of number of sections and number of rules for each firewall category (L2DFW, L3DFW). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsSummaryTest() throws ApiException {
        String source = null;
        FirewallSectionsSummaryList response = api.getSectionsSummary(source);

        // TODO: test validations
    }
    /**
     * Get firewall profiles available.
     *
     * List all the firewall profiles available by requested resource_type. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFirewallProfilesTest() throws ApiException {
        String resourceType = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        FirewallProfileListResult response = api.listFirewallProfiles(resourceType, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * List all firewall status for supported contexts
     *
     * List all firewall status for supported contexts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFirewallStatusTest() throws ApiException {
        FirewallStatusListResult response = api.listFirewallStatus();

        // TODO: test validations
    }
    /**
     * List All Firewall Sections
     *
     * List all firewall section in paginated form. A default page size is limited to 1000 firewall sections. By default list of section is filtered by LAYER3 type. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSectionsTest() throws ApiException {
        String appliedTos = null;
        String contextProfiles = null;
        String cursor = null;
        Boolean deepSearch = null;
        String destinations = null;
        String enforcedOn = null;
        String excludeAppliedToType = null;
        String extendedSources = null;
        String filterType = null;
        String includeAppliedToType = null;
        String includedFields = null;
        Boolean locked = null;
        Long pageSize = null;
        Boolean searchInvalidReferences = null;
        String searchScope = null;
        String services = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String sources = null;
        String type = null;
        FirewallSectionListResult response = api.listSections(appliedTos, contextProfiles, cursor, deepSearch, destinations, enforcedOn, excludeAppliedToType, extendedSources, filterType, includeAppliedToType, includedFields, locked, pageSize, searchInvalidReferences, searchScope, services, sortAscending, sortBy, sources, type);

        // TODO: test validations
    }
    /**
     * Lock a section
     *
     * Lock a section 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lockSectionLockTest() throws ApiException {
        FirewallSectionLock body = null;
        String sectionId = null;
        FirewallSection response = api.lockSectionLock(body, sectionId);

        // TODO: test validations
    }
    /**
     * Read an Existing Rule
     *
     * Return existing firewall rule information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readFirewallRuleTest() throws ApiException {
        String ruleId = null;
        FirewallRule response = api.readFirewallRule(ruleId);

        // TODO: test validations
    }
    /**
     * Remove an existing object from the exclude list
     *
     * Remove an existing object from the exclude list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeMemberRemoveMemberTest() throws ApiException {
        String objectId = null;
        Boolean deepCheck = null;
        String objectType = null;
        ResourceReference response = api.removeMemberRemoveMember(objectId, deepCheck, objectType);

        // TODO: test validations
    }
    /**
     * Reset firewall rule statistics
     *
     * Sets firewall rule statistics counter to zero. This operation is supported for given category, for example: L3DFW i.e. for all layer3 firewall (transport nodes only) rules or L3EDGE i.e. for all layer3 edge firewall (edge nodes only) rules or L3BRIDGEPORT i.e. for all layer3 bridge port firewall (bridge ports only) rules. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetFirewallRuleStatsResetTest() throws ApiException {
        String category = null;
        api.resetFirewallRuleStatsReset(category);

        // TODO: test validations
    }
    /**
     * Update an Existing Rule and Reorder the Rule
     *
     * Modifies existing firewall rule along with relative position among other firewall rules inside a firewall section. Revising firewall rule in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reviseRuleReviseTest() throws ApiException {
        FirewallRule body = null;
        String sectionId = null;
        String ruleId = null;
        String id = null;
        String operation = null;
        FirewallRule response = api.reviseRuleRevise(body, sectionId, ruleId, id, operation);

        // TODO: test validations
    }
    /**
     * Update an Existing Section, Including Its Position
     *
     * Modifies an existing firewall section along with its relative position among other firewall sections in the system. Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reviseSectionReviseTest() throws ApiException {
        FirewallSection body = null;
        String sectionId = null;
        String id = null;
        String operation = null;
        FirewallSection response = api.reviseSectionRevise(body, sectionId, id, operation);

        // TODO: test validations
    }
    /**
     * Update an Existing Section with Rules
     *
     * Modifies an existing firewall section along with its relative position among other firewall sections with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to move a section above or below another section, use: POST /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;?action&#x3D;revise  To modify rules, use: PUT /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt;  Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reviseSectionWithRulesReviseWithRulesTest() throws ApiException {
        FirewallSectionRuleList body = null;
        String sectionId = null;
        String id = null;
        String operation = null;
        FirewallSectionRuleList response = api.reviseSectionWithRulesReviseWithRules(body, sectionId, id, operation);

        // TODO: test validations
    }
    /**
     * Unlock a section
     *
     * Unlock a section 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unlockSectionUnlockTest() throws ApiException {
        FirewallSectionLock body = null;
        String sectionId = null;
        FirewallSection response = api.unlockSectionUnlock(body, sectionId);

        // TODO: test validations
    }
    /**
     * Modify exclude list
     *
     * Modify exclude list
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateExcludeListTest() throws ApiException {
        ExcludeList body = null;
        ExcludeList response = api.updateExcludeList(body);

        // TODO: test validations
    }
    /**
     * Update a firewall profile.
     *
     * Update user configurable properties of firewall profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFirewallProfileTest() throws ApiException {
        BaseFirewallProfile body = null;
        String profileId = null;
        BaseFirewallProfile response = api.updateFirewallProfile(body, profileId);

        // TODO: test validations
    }
    /**
     * Update global firewall status for dfw context
     *
     * Update global firewall status for dfw context
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFirewallStatusTest() throws ApiException {
        FirewallStatus body = null;
        String contextType = null;
        FirewallStatus response = api.updateFirewallStatus(body, contextType);

        // TODO: test validations
    }
    /**
     * Update an Existing Rule
     *
     * Modifies existing firewall rule in a firewall section. Updating firewall rule in a section modifies parent section entity and simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRuleTest() throws ApiException {
        FirewallRule body = null;
        String sectionId = null;
        String ruleId = null;
        FirewallRule response = api.updateRule(body, sectionId, ruleId);

        // TODO: test validations
    }
    /**
     * Update an Existing Section
     *
     * Modifies the specified section, but does not modify the section&#x27;s associated rules. Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSectionTest() throws ApiException {
        FirewallSection body = null;
        String sectionId = null;
        FirewallSection response = api.updateSection(body, sectionId);

        // TODO: test validations
    }
    /**
     * Update an Existing Section, Including Its Rules
     *
     * Modifies existing firewall section along with its association with rules. When invoked on a large number of rules, this API is supported only at low rates of invocation (not more than 2 times per minute). The typical latency of this API with about 1024 rules is about 15 seconds in a cluster setup. This API should not be invoked with large payloads at automation speeds.  Instead, to update rule content, use: PUT /api/v1/firewall/sections/&amp;lt;section-id&amp;gt;/rules/&amp;lt;rule-id&amp;gt;  Simultaneous update (modify) operations on same section are not allowed to prevent overwriting stale contents to firewall section. If a concurrent update is performed, HTTP response code 409 will be returned to the client operating on stale data. That client should retrieve the firewall section again and re-apply its update. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSectionWithRulesUpdateWithRulesTest() throws ApiException {
        FirewallSectionRuleList body = null;
        String sectionId = null;
        FirewallSectionRuleList response = api.updateSectionWithRulesUpdateWithRules(body, sectionId);

        // TODO: test validations
    }
}

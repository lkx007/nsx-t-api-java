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
import io.swagger.client.model.EffectiveIPAddressMemberListResult;
import io.swagger.client.model.EffectiveMemberResourceListResult;
import io.swagger.client.model.EffectiveMemberTypeListResult;
import io.swagger.client.model.NSGroup;
import io.swagger.client.model.NSGroupExpressionList;
import io.swagger.client.model.NSGroupListResult;
import io.swagger.client.model.ServiceAssociationListResult;
import io.swagger.client.model.UnassociatedVMListResult;
import io.swagger.client.model.VirtualMachineListResult;
import io.swagger.client.model.VirtualNetworkInterfaceListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiGroupingObjectsNsGroupsApi
 */
@Ignore
public class ManagementPlaneApiGroupingObjectsNsGroupsApiTest {

    private final ManagementPlaneApiGroupingObjectsNsGroupsApi api = new ManagementPlaneApiGroupingObjectsNsGroupsApi();

    /**
     * Add NSGroup expression
     *
     * Add/remove the expressions passed in the request body to/from the NSGroup 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrRemoveNSGroupExpressionTest() throws ApiException {
        NSGroupExpressionList body = null;
        String action = null;
        String nsGroupId = null;
        NSGroup response = api.addOrRemoveNSGroupExpression(body, action, nsGroupId);

        // TODO: test validations
    }
    /**
     * Create NSGroup
     *
     * Creates a new NSGroup that can group NSX resources - VIFs, Lports and LSwitches as well as the grouping objects - IPSet, MACSet and other NSGroups. For NSGroups containing VM criteria(both static and dynamic), system VMs will not be included as members. This filter applies at VM level only. Exceptions are as follows: 1. LogicalPorts and VNI of System VMs will be included in NSGroup if the criteria  is based on LogicalPort, LogicalSwitch or VNI directly. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNSGroupTest() throws ApiException {
        NSGroup body = null;
        NSGroup response = api.createNSGroup(body);

        // TODO: test validations
    }
    /**
     * Delete NSGroup
     *
     * Deletes the specified NSGroup. By default, if the NSGroup is added to another NSGroup, it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the NSGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNSGroupTest() throws ApiException {
        String nsGroupId = null;
        Boolean force = null;
        api.deleteNSGroup(nsGroupId, force);

        // TODO: test validations
    }
    /**
     * Get Effective Directory Groups of the specified NSGroup.
     *
     * Returns effective directory groups which are members of the specified NSGroup. This API is applicable only for NSGroups containing DirectoryGroup member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveActiveDirectoryGroupsTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberResourceListResult response = api.getEffectiveActiveDirectoryGroups(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get Effective IPAddress translated from the NSGroup
     *
     * Returns effective ip address members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachine, VIF, LogicalSwitch, LogicalPort or IPSet member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveIPAddressMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveIPAddressMemberListResult response = api.getEffectiveIPAddressMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get Effective IPSets of the specified NSGroup.
     *
     * Returns effective IPSets which are members of the specified NSGroup. This API is applicable only for NSGroups containing IPSet member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveIPSetMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberResourceListResult response = api.getEffectiveIPSetMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get Effective Logical Ports translated from the NSgroup
     *
     * Returns effective logical port members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachines, LogicalSwitch or LogicalPort member types.For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveLogicalPortMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberResourceListResult response = api.getEffectiveLogicalPortMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get Effective switch members translated from the NSGroup
     *
     * Returns effective logical switch members of the specified NSGroup. This API is applicable for NSGroups containing LogicalSwitch members. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveLogicalSwitchMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberResourceListResult response = api.getEffectiveLogicalSwitchMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get effective transport node members translated from the NSGroup
     *
     * Returns effective transport node members of the specified NSGroup. This API is applicable only for NSGroups containing TransportNode member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveTransportNodeMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberResourceListResult response = api.getEffectiveTransportNodeMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get effective VIF members translated from the NSGroup
     *
     * Returns effective VIF members of the specified NSGroup. This API is applicable only for NSGroups containing either VirtualMachines or VIF member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveVIFMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        VirtualNetworkInterfaceListResult response = api.getEffectiveVIFMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get Effective Virtual Machine members of the specified NSGroup.
     *
     * Returns effective virtual machine members of the specified NSGroup. This API is applicable only for NSGroups containing VirtualMachine member type. For NSGroups containing other member types,it returns an empty list. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffectiveVirtualMachineMembersTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        VirtualMachineListResult response = api.getEffectiveVirtualMachineMembers(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get member types from NSGroup
     *
     * Returns member types for a specified NSGroup including child NSGroups. This considers static members and members added via membership criteria only 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberTypesTest() throws ApiException {
        String nsGroupId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        EffectiveMemberTypeListResult response = api.getMemberTypes(nsGroupId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get services to which the given nsgroup belongs to 
     *
     * Returns information about services that are associated with the given NSGroup. The service name is passed by service_type parameter 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServiceAssociationsTest() throws ApiException {
        String nsgroupId = null;
        String serviceType = null;
        String cursor = null;
        Boolean fetchParentgroupAssociations = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ServiceAssociationListResult response = api.getServiceAssociations(nsgroupId, serviceType, cursor, fetchParentgroupAssociations, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get the list of all the virtual machines that are not a part of any existing NSGroup.
     *
     * Get the list of all the virtual machines that are not a part of any existing NSGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnassociatedVirtualMachinesTest() throws ApiException {
        String cursor = null;
        String displayName = null;
        String externalId = null;
        String hostId = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        UnassociatedVMListResult response = api.getUnassociatedVirtualMachines(cursor, displayName, externalId, hostId, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * List NSGroups
     *
     * List the NSGroups in a paginated format. The page size is restricted to 50 NSGroups so that the size of the response remains small even in the worst case. Optionally, specify valid member types as request parameter to filter NSGroups. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNSGroupsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        String memberTypes = null;
        Long pageSize = null;
        Boolean populateReferences = null;
        Boolean sortAscending = null;
        String sortBy = null;
        NSGroupListResult response = api.listNSGroups(cursor, includedFields, memberTypes, pageSize, populateReferences, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read NSGroup
     *
     * Returns information about the specified NSGroup. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNSGroupTest() throws ApiException {
        String nsGroupId = null;
        Boolean populateReferences = null;
        NSGroup response = api.readNSGroup(nsGroupId, populateReferences);

        // TODO: test validations
    }
    /**
     * Update NSGroup
     *
     * Updates the specified NSGroup. Modifiable parameters include the description, display_name and members. For NSGroups containing VM criteria(both static and dynamic), system VMs will not be included as members. This filter applies at VM level only. Exceptions are as follows. 1. LogicalPorts and VNI of system VMs will be included in NSGroup if the criteria  is based on LogicalPort, LogicalSwitch or VNI directly. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNSGroupTest() throws ApiException {
        NSGroup body = null;
        String nsGroupId = null;
        NSGroup response = api.updateNSGroup(body, nsGroupId);

        // TODO: test validations
    }
}

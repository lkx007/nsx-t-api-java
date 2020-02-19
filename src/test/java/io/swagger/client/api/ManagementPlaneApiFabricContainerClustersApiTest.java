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
import io.swagger.client.model.ContainerCluster;
import io.swagger.client.model.ContainerClusterListResult;
import io.swagger.client.model.ContainerClusterNode;
import io.swagger.client.model.ContainerClusterNodeListResult;
import io.swagger.client.model.ContainerIngressPolicy;
import io.swagger.client.model.ContainerIngressPolicyListResult;
import io.swagger.client.model.ContainerNetworkPolicy;
import io.swagger.client.model.ContainerNetworkPolicyListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiFabricContainerClustersApi
 */
@Ignore
public class ManagementPlaneApiFabricContainerClustersApiTest {

    private final ManagementPlaneApiFabricContainerClustersApi api = new ManagementPlaneApiFabricContainerClustersApi();

    /**
     * Return a container cluster
     *
     * Returns information about a specific container cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerClusterTest() throws ApiException {
        String containerClusterId = null;
        ContainerCluster response = api.getContainerCluster(containerClusterId);

        // TODO: test validations
    }
    /**
     * Return a container cluster node
     *
     * Returns information about a specific container cluster node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerClusterNodeTest() throws ApiException {
        String containerClusterNodeId = null;
        ContainerClusterNode response = api.getContainerClusterNode(containerClusterNodeId);

        // TODO: test validations
    }
    /**
     * Returns an ingress policy spec
     *
     * Returns information about a specific ingress policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerIngressPolicyTest() throws ApiException {
        String ingressPolicyId = null;
        ContainerIngressPolicy response = api.getContainerIngressPolicy(ingressPolicyId);

        // TODO: test validations
    }
    /**
     * Return a network policy spec
     *
     * Returns information about a specific network policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerNetworkPolicyTest() throws ApiException {
        String networkPolicyId = null;
        ContainerNetworkPolicy response = api.getContainerNetworkPolicy(networkPolicyId);

        // TODO: test validations
    }
    /**
     * Return the list of container cluster nodes
     *
     * Returns information about all container cluster nodes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContainerClusterNodesTest() throws ApiException {
        String containerClusterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ContainerClusterNodeListResult response = api.listContainerClusterNodes(containerClusterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Return the List of Container Clusters
     *
     * Returns information about all Container Clusters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContainerClustersTest() throws ApiException {
        String clusterType = null;
        String cursor = null;
        String includedFields = null;
        String infraType = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ContainerClusterListResult response = api.listContainerClusters(clusterType, cursor, includedFields, infraType, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Return the List of Container Ingress Policies
     *
     * Returns information about all ingress policies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContainerIngressPoliciesTest() throws ApiException {
        String containerClusterId = null;
        String containerProjectId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ContainerIngressPolicyListResult response = api.listContainerIngressPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Return the List of Container Network Policies
     *
     * Returns information about all network policies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listContainerNetworkPoliciesTest() throws ApiException {
        String containerClusterId = null;
        String containerProjectId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ContainerNetworkPolicyListResult response = api.listContainerNetworkPolicies(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
}
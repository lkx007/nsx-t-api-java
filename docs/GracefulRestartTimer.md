# GracefulRestartTimer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**restartTimer** | **Long** | Maximum time BGP speaker will take for the BGP session to be re-established after a restart. Ranges from 1 sec to 3600 sec. This can be used to speed up routing convergence by its peer in case that the BGP speaker does not come back after a restart. If the session does not get re-established within the \&quot;Restart Time\&quot; that the Restarting Speaker advertised previously, the Receiving Speaker will delete all the stale routes from that peer.  |  [optional]
**staleTimer** | **Long** | Maximum time before stale routes are removed from the RIB when the local BGP process restarts. Ranges from 1 sec to 3600 sec.  |  [optional]

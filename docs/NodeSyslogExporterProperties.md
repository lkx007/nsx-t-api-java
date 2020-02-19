# NodeSyslogExporterProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tlsCaPem** | **String** | CA certificate PEM of TLS server to export to |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Export protocol | 
**exporterName** | **String** | Syslog exporter name | 
**level** | [**LevelEnum**](#LevelEnum) | Logging level to export | 
**tlsClientCaPem** | **String** | CA certificate PEM of the rsyslog client |  [optional]
**tlsCertPem** | **String** | Certificate PEM of the rsyslog client |  [optional]
**server** | **String** | IP address or hostname of server to export to | 
**facilities** | [**List&lt;FacilitiesEnum&gt;**](#List&lt;FacilitiesEnum&gt;) | Facilities to export |  [optional]
**msgids** | **List&lt;String&gt;** | MSGIDs to export |  [optional]
**structuredData** | **List&lt;String&gt;** | Structured data to export |  [optional]
**port** | **Long** | Port to export to |  [optional]
**tlsKeyPem** | **String** | Private key PEM of the rsyslog client |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
TCP | &quot;TCP&quot;
TLS | &quot;TLS&quot;
UDP | &quot;UDP&quot;
LI | &quot;LI&quot;
LI_TLS | &quot;LI-TLS&quot;

<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
EMERG | &quot;EMERG&quot;
ALERT | &quot;ALERT&quot;
CRIT | &quot;CRIT&quot;
ERR | &quot;ERR&quot;
WARNING | &quot;WARNING&quot;
NOTICE | &quot;NOTICE&quot;
INFO | &quot;INFO&quot;
DEBUG | &quot;DEBUG&quot;

<a name="List<FacilitiesEnum>"></a>
## Enum: List&lt;FacilitiesEnum&gt;
Name | Value
---- | -----
KERN | &quot;KERN&quot;
USER | &quot;USER&quot;
MAIL | &quot;MAIL&quot;
DAEMON | &quot;DAEMON&quot;
AUTH | &quot;AUTH&quot;
SYSLOG | &quot;SYSLOG&quot;
LPR | &quot;LPR&quot;
NEWS | &quot;NEWS&quot;
UUCP | &quot;UUCP&quot;
AUTHPRIV | &quot;AUTHPRIV&quot;
FTP | &quot;FTP&quot;
LOGALERT | &quot;LOGALERT&quot;
CRON | &quot;CRON&quot;
LOCAL0 | &quot;LOCAL0&quot;
LOCAL1 | &quot;LOCAL1&quot;
LOCAL2 | &quot;LOCAL2&quot;
LOCAL3 | &quot;LOCAL3&quot;
LOCAL4 | &quot;LOCAL4&quot;
LOCAL5 | &quot;LOCAL5&quot;
LOCAL6 | &quot;LOCAL6&quot;
LOCAL7 | &quot;LOCAL7&quot;

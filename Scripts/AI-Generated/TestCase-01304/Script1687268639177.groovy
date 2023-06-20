import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_graphql-with-variable-got-error-errors-message-json-request-body-could-not-be-decoded-json-cannot-unmarshal-string-into-go-struct-field-rawparams-variables-of-type-map-string-interface-body-n-query-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/graphql-with-variable-got-error-errors-message-json-request-body-could-not-be-decoded-json-cannot-unmarshal-string-into-go-struct-field-rawparams-variables-of-type-map-string-interface-body-n-query-mutatio/86182/2')

'step 2: Add visual checkpoint at Page_t_graphql-with-variable-got-error-errors-message-json-request-body-could-not-be-decoded-json-cannot-unmarshal-string-into-go-struct-field-rawparams-variables-of-type-map-string-interface-body-n-query-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01304_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

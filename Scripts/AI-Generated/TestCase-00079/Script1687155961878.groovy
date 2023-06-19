import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_count-values-in-a-json-array-returned-from-a-rest-api-call'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/count-values-in-a-json-array-returned-from-a-rest-api-call/30156')

'step 2: Add visual checkpoint at Page_t_count-values-in-a-json-array-returned-from-a-rest-api-call'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00079_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

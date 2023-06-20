import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_parameterizing-http-body-for-api-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/parameterizing-http-body-for-api-testing/11752')

'step 2: Add visual checkpoint at Page_t_parameterizing-http-body-for-api-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00319_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

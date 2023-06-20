import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-when-integrating-with-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-when-integrating-with-testrail/14007/5')

'step 2: Add visual checkpoint at Page_t_error-when-integrating-with-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01105_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_native-automation-test-object-15'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/native-automation-test-object-management/81737/15')

'step 2: Add visual checkpoint at Page_t_native-automation-test-object-15'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00294_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

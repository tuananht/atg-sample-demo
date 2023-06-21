import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-start-arm-native-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-start-arm-native-browser/84483/3')

'step 2: Add visual checkpoint at Page_t_how-to-start-arm-native-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00166_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

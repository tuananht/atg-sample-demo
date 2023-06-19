import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-studio-native-popup-window-and-upload-file'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-studio-native-popup-window-and-upload-file/19386')

'step 2: Add visual checkpoint at Page_t_katalon-studio-native-popup-window-and-upload-file'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00217_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_select-option-from-drop-down-box-by-katalon-recorder-google-chrome-extension'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/select-option-from-drop-down-box-by-katalon-recorder-google-chrome-extension/40082')

'step 2: Add visual checkpoint at Page_t_select-option-from-drop-down-box-by-katalon-recorder-google-chrome-extension'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00581_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

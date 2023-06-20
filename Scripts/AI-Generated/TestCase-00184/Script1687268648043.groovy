import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_help-with-importing-katalon-recorder-test-scripts-into-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/help-with-importing-katalon-recorder-test-scripts-into-katalon-studio/8286')

'step 2: Add visual checkpoint at Page_t_help-with-importing-katalon-recorder-test-scripts-into-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00184_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

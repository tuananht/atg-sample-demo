import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-clear-input-fields-in-web'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-clear-input-fields-in-web/8549')

'step 2: Add visual checkpoint at Page_t_how-to-clear-input-fields-in-web'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00243_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

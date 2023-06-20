import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_click-on-button-which-changes-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/click-on-button-which-changes-position/45084/3')

'step 2: Add visual checkpoint at Page_t_click-on-button-which-changes-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01101_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

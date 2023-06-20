import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_waiting-for-element-to-disappear-from-users-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/waiting-for-element-to-disappear-from-users-perspective/34765/3')

'step 2: Add visual checkpoint at Page_t_waiting-for-element-to-disappear-from-users-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01310_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

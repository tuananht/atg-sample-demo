import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_j_r_preferences_account'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/j_r/preferences/account')

'step 2: Add visual checkpoint at Page_u_j_r_preferences_account'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00712_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

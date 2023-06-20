import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_rkrahul55_preferences_profile'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/rkrahul55/preferences/profile')

'step 2: Add visual checkpoint at Page_u_rkrahul55_preferences_profile'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01272_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

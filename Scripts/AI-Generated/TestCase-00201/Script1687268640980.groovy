import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-programmatically-set-or-get-a-running-profile'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-programmatically-set-or-get-a-running-profile/10719')

'step 2: Add visual checkpoint at Page_t_how-to-programmatically-set-or-get-a-running-profile'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00201_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

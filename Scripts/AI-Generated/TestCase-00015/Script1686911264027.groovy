import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_opening-chrome-browser-with-a-predefined-custom-chrome-profile-which-stores-session-info-such-as-credentials-and-cookies'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/opening-chrome-browser-with-a-predefined-custom-chrome-profile-which-stores-session-info-such-as-credentials-and-cookies/20966')

'step 2: Add visual checkpoint at Page_t_opening-chrome-browser-with-a-predefined-custom-chrome-profile-which-stores-session-info-such-as-credentials-and-cookies'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00015_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

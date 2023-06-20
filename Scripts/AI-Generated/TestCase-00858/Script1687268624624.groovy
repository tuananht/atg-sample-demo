import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-start-firefox-in-private-browsing-mode'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-start-firefox-in-private-browsing-mode/47271')

'step 2: Add visual checkpoint at Page_t_how-to-start-firefox-in-private-browsing-mode'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00858_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

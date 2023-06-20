import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cannot-find-firefox-binary-in-path-make-sure-firefox-is-installed'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cannot-find-firefox-binary-in-path-make-sure-firefox-is-installed/13012')

'step 2: Add visual checkpoint at Page_t_cannot-find-firefox-binary-in-path-make-sure-firefox-is-installed'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01028_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

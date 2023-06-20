import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps/79842')

'step 2: Add visual checkpoint at Page_t_where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00850_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

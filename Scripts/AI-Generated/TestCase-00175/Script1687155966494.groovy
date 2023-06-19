import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps/79842')

'step 2: Add visual checkpoint at Page_t_where-should-i-store-test-files-that-are-not-data-and-how-do-i-pass-it-on-to-steps'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00175_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

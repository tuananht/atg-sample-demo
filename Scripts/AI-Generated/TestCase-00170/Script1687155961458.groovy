import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_generating-random-email-address-with-current-timestamp'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/generating-random-email-address-with-current-timestamp/17898')

'step 2: Add visual checkpoint at Page_t_generating-random-email-address-with-current-timestamp'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00170_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

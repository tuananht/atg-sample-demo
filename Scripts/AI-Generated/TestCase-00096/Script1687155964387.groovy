import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_sharing-test-cases-or-keywords-to-multiple-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/sharing-test-cases-or-keywords-to-multiple-projects/9520/5')

'step 2: Add visual checkpoint at Page_t_sharing-test-cases-or-keywords-to-multiple-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00096_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

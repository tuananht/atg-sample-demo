import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-fail-a-test-if-the-condition-is-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-fail-a-test-if-the-condition-is-false/29377/6')

'step 2: Add visual checkpoint at Page_t_how-to-fail-a-test-if-the-condition-is-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00016_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

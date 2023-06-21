import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-landscape-of-ai-enabled-test-automation-tools'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-landscape-of-ai-enabled-test-automation-tools/84538')

'step 2: Add visual checkpoint at Page_t_the-landscape-of-ai-enabled-test-automation-tools'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00199_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

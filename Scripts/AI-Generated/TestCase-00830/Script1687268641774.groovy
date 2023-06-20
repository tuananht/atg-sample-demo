import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-suite-execution-taking-too-long-was-katalon-became-useless'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-suite-execution-taking-too-long-was-katalon-became-useless/34537')

'step 2: Add visual checkpoint at Page_t_test-suite-execution-taking-too-long-was-katalon-became-useless'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00830_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

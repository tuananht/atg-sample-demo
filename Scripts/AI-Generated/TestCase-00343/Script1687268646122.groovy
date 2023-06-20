import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-open-test-suites-with-tests'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-open-test-suites-with-tests/9389')

'step 2: Add visual checkpoint at Page_t_cant-open-test-suites-with-tests'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00343_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

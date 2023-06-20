import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-16'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/23504/16')

'step 2: Add visual checkpoint at Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-16'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00541_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

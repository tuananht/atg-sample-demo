import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_execute-test-cases-inside-of-test-suite-in-13'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/execute-test-cases-inside-of-test-suite-in-parallel/9297/13')

'step 2: Add visual checkpoint at Page_t_execute-test-cases-inside-of-test-suite-in-13'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01180_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

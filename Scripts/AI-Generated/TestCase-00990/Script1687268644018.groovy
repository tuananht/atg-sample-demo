import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_integration-of-other-test-management-tool'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/integration-of-other-test-management-tool/8602')

'step 2: Add visual checkpoint at Page_t_integration-of-other-test-management-tool'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00990_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

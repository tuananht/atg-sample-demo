import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_suggestion-to-add-integration-with-testlink-test-case-management'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/suggestion-to-add-integration-with-testlink-test-case-management/9659')

'step 2: Add visual checkpoint at Page_t_suggestion-to-add-integration-with-testlink-test-case-management'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00980_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

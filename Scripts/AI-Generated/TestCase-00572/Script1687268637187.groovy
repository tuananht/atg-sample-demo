import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cucumber-run-feature-file-with-tags'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cucumber-run-feature-file-with-tags/34672')

'step 2: Add visual checkpoint at Page_t_cucumber-run-feature-file-with-tags'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00572_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

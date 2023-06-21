import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_invalid-path-exception-unable-to-run-test-in-webservice-upload-16'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/invalid-path-exception-unable-to-run-test-in-webservice-upload-file/51608/16')

'step 2: Add visual checkpoint at Page_t_invalid-path-exception-unable-to-run-test-in-webservice-upload-16'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00045_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

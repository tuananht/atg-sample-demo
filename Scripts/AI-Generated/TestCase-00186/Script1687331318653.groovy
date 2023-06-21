import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_local-file-detector-to-handle-file-uploads-on-remote-execution'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/local-file-detector-to-handle-file-uploads-on-remote-execution/12705')

'step 2: Add visual checkpoint at Page_t_local-file-detector-to-handle-file-uploads-on-remote-execution'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00186_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

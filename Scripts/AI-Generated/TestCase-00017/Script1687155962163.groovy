import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-ops-cloud-and-cloud-tunnel-execution-data-not-updated-in-cirtification-progress'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-ops-cloud-and-cloud-tunnel-execution-data-not-updated-in-cirtification-progress/84576')

'step 2: Add visual checkpoint at Page_t_test-ops-cloud-and-cloud-tunnel-execution-data-not-updated-in-cirtification-progress'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00017_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_custom-test-report-compiled-by-testlistener-kazurayam-ks-plainreport'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/custom-test-report-compiled-by-testlistener-kazurayam-ks-plainreport/50537')

'step 2: Add visual checkpoint at Page_t_custom-test-report-compiled-by-testlistener-kazurayam-ks-plainreport'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00465_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

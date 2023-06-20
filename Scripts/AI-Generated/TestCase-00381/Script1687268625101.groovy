import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-loadvars-runs-for-an-extra-csv-row-that-doesnt-exist'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-loadvars-runs-for-an-extra-csv-row-that-doesnt-exist/11073')

'step 2: Add visual checkpoint at Page_t_the-loadvars-runs-for-an-extra-csv-row-that-doesnt-exist'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00381_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

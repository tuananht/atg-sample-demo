import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_possible-to-customize-parameter-query-in-test-script'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/possible-to-customize-parameter-query-in-test-script/41241')

'step 2: Add visual checkpoint at Page_t_possible-to-customize-parameter-query-in-test-script'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00797_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_execution-profile-should-be-reported-in-the-report-html-and-exported-to-10'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/execution-profile-should-be-reported-in-the-report-html-and-exported-to-pdf/14382/10')

'step 2: Add visual checkpoint at Page_t_execution-profile-should-be-reported-in-the-report-html-and-exported-to-10'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01108_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

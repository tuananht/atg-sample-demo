import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_html-reports-taking-hours-to-generate-because-katalon-takes-automatic-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/html-reports-taking-hours-to-generate-because-katalon-takes-automatic-screenshots/25936/3')

'step 2: Add visual checkpoint at Page_t_html-reports-taking-hours-to-generate-because-katalon-takes-automatic-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01284_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()

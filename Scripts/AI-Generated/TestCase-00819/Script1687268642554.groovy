import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_add-feature-file-directly-to-test-suites-dynamic-test-suite-for-feature-file'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/add-feature-file-directly-to-test-suites-dynamic-test-suite-for-feature-file/63462')

'step 2: Add visual checkpoint at Page_t_add-feature-file-directly-to-test-suites-dynamic-test-suite-for-feature-file'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00819_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
